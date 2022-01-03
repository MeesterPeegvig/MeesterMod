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

    // Gives player iron axe upon world entry
//    @SubscribeEvent
//    public void entityJoinWorld(EntityJoinWorldEvent event) {
//        if (event.entity instanceof EntityPlayer) {
//            EntityPlayer player = (EntityPlayer) event.entity;
//            player.inventory.addItemStackToInventory(new ItemStack(Items.iron_axe));
//
//        }
//    }

    // Scans and sends chat message accordingly
    @SubscribeEvent
    public void ClientChatReceived(ClientChatReceivedEvent event) {
        String chatMsg = event.message.getUnformattedText();
        String gg = "gg";
        String lessThan = "<";
        System.out.println(chatMsg);
        int indexOfCloseBracket = chatMsg.indexOf("]");
        if (indexOfCloseBracket == -1) {
            indexOfCloseBracket = chatMsg.indexOf(">");
        }
        System.out.println(indexOfCloseBracket);
        String chatMsgSender = chatMsg.substring(1, indexOfCloseBracket);
        String parsedChatMsg = chatMsg.substring(indexOfCloseBracket + 2);
        System.out.println(parsedChatMsg);
        System.out.println(chatMsgSender);
        if ((parsedChatMsg.equals(gg)) && !(chatMsg.substring(0,1).equals(lessThan))) {
            getMinecraft().thePlayer.sendChatMessage("Good Game to you too, " + chatMsgSender + "!");
        }
    }

    // Lights player on fire when holding apple
//    @SubscribeEvent
//    public void livingUpdate(LivingEvent.LivingUpdateEvent event) {
//        if (event.entity instanceof EntityPlayer) {
//            EntityPlayer player = (EntityPlayer) event.entity;
//            if (player.getHeldItem() != null) {
//                if (player.getHeldItem().getItem() == Items.apple) {
//                    player.setFire(5);
//                }
//            }
//        }
//    }
}
