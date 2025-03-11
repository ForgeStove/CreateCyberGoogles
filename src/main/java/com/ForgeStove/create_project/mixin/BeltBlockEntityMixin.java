package com.ForgeStove.create_project.mixin;
import com.simibubi.create.content.kinetics.base.*;
import com.simibubi.create.content.kinetics.belt.BeltBlockEntity;
import com.simibubi.create.foundation.utility.CreateLang;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;

import java.util.List;
@Mixin(BeltBlockEntity.class) public abstract class BeltBlockEntityMixin extends KineticBlockEntity {
	public BeltBlockEntityMixin(BlockEntityType<?> typeIn, BlockPos pos, BlockState state) {
		super(typeIn, pos, state);
	}
	@Override public boolean addToGoggleTooltip(List<Component> tooltip, boolean isPlayerSneaking) {
		CreateLang.translate("gui.goggles.kinetic_stats").forGoggles(tooltip);
		IRotate.SpeedLevel.getFormattedSpeedText(getSpeed(), overStressed).forGoggles(tooltip);
		return true;
	}
}
