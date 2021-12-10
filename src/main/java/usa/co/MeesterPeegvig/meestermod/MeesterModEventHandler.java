package usa.co.MeesterPeegvig.meestermod;

import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.ICrashCallable;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Iterator;
import java.util.List;

import static net.minecraft.client.Minecraft.getMinecraft;

public class MeesterModEventHandler {

    EntityPlayer myPlayer = Minecraft.getMinecraft().thePlayer;

    @SubscribeEvent
    public void entityJoinWorld(EntityJoinWorldEvent event) {
        if (event.entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.entity;
            player.inventory.addItemStackToInventory(new ItemStack(Items.iron_axe));

        }
    }

    @SubscribeEvent
    public void ClientChatRecieved(ClientChatReceivedEvent event) {
        String chatMsg = event.message.getUnformattedText();
        String gg = "gg";
        System.out.println("chatMSG :: " + chatMsg);
        System.out.println("gg :: " + gg);
        System.out.println(chatMsg.equals(gg));
        if (chatMsg.equals(gg)) {
            System.out.println("in If :D");
            getMinecraft().thePlayer.sendChatMessage("Wholesome :D");
        }
    }

    @SubscribeEvent
    public void livingUpdate(LivingEvent.LivingUpdateEvent event) {
        if (event.entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.entity;
            if (player.getHeldItem() != null) {
                if (player.getHeldItem().getItem() == Items.apple) {
                    player.setFire(5);
                }
            }
        }
    }
}