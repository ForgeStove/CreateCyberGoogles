package ForgeStove.create_cyber_googles.fabric.mixin;
import com.simibubi.create.content.equipment.goggles.GogglesItem;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
@Mixin(GogglesItem.class) public abstract class GogglesItemMixin {
	@Inject(method = "isWearingGoggles", at = @At("HEAD"), remap = false, cancellable = true)
	private static void isWearingGogglesMixin(Player player, @NotNull CallbackInfoReturnable<Boolean> returnable) {
		returnable.setReturnValue(true);
	}
}
