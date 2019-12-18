package me.kbz.nostalgia.discord

import club.minnced.discord.rpc.DiscordEventHandlers
import club.minnced.discord.rpc.DiscordRPC
import club.minnced.discord.rpc.DiscordRichPresence
import me.kbz.nostalgia.Reference
import kotlin.concurrent.thread

object DiscordPresence {
    fun init() {
        val id = "457973823833243654"

        println("Starting RPC...")
        discord {
            val handlers = handlers {
                ready = DiscordEventHandlers.OnReady { println("Discord RPC loaded.") }
                errored = DiscordEventHandlers.OnStatus { code, message -> println("$code: $message") }
            }

            Discord_Initialize(id, handlers, true, null)

            presence {
                details = "Nostalgia"
                startTimestamp = System.currentTimeMillis() / 1000
                largeImageKey = "large"
                largeImageText = "Nostalgia ${Reference.VERSION}"
            }

            thread(name="Callback") {
                while (!Thread.currentThread().isInterrupted) {
                    Discord_RunCallbacks()
                    Thread.sleep(2000)
                }
            }
        }
    }

    private fun discord(block: DiscordRPC.() -> Unit) = DiscordRPC.INSTANCE.apply(block)
    private fun handlers(block: DiscordEventHandlers.() -> Unit) = DiscordEventHandlers().apply(block)
    private fun DiscordRPC.presence(block: DiscordRichPresence.() -> Unit) {
        Discord_UpdatePresence(DiscordRichPresence().apply(block))
    }
}