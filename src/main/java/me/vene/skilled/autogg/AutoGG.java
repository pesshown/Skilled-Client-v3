 package me.vene.skilled.autogg;
 
 import java.io.IOException;
 import java.net.URL;
 import net.minecraft.client.Minecraft;
 import net.minecraft.util.EnumChatFormatting;
 import net.minecraftforge.client.event.ClientChatReceivedEvent;
 import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
 import org.apache.commons.io.IOUtils;

 public class AutoGG {
   public static String unformattedMessage;
   private String[] triggers;
   private Minecraft mc = Minecraft.getMinecraft();
   
   public class AutoGG {
   public static String unformattedMessage;

   public AutoGG() {
       // Constructor is now empty
   }

   @SubscribeEvent
   public void onChat(final ClientChatReceivedEvent event) {
       // Method is now empty
   }
}
