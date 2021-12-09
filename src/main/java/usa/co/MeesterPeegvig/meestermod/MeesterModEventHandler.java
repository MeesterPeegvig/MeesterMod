package usa.co.MeesterPeegvig.meestermod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MeesterModEventHandler {

    @SubscribeEvent
    public void entityJoinWorld(EntityJoinWorldEvent event){
        if (event.entity instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer) event.entity;
            player.inventory.addItemStackToInventory(new ItemStack(Items.iron_axe));

        }
    }
    @SubscribeEvent
    public void ClientChatRecieved(ClientChatReceivedEvent event){
        if (event.message.equals("gg")){
            System.out.println("Wholesome :D");

        }
    }
}