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
        System.out.println(chatMsg);
        int indexOfOpenBracket =chatMsg.indexOf("[");
        int indexOfCloseBracket =chatMsg.indexOf("]");
        //String chatMsgSender = chatMsg.substring(indexOfOpenBracket+1,indexOfCloseBracket);
        String parsedChatMsg = chatMsg.substring(indexOfCloseBracket+2);
        System.out.println(parsedChatMsg);
        //System.out.println(chatMsgSender);
        // fix error with out of index
        if (parsedChatMsg.equals(gg)) {
            getMinecraft().thePlayer.sendChatMessage("Good game to you too!");
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
