package com.kyle.hobbitcraft.screen;

import com.kyle.hobbitcraft.HobbitCraft;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class WibkitiumCollectorScreen extends AbstractContainerScreen<WibkitiumCollectorMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(HobbitCraft.MOD_ID, "textures/gui/wibkitium_collector_gui.png");

    public WibkitiumCollectorScreen(WibkitiumCollectorMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();
        this.inventoryLabelY = 10000; // Hide inventory label
        this.titleLabelY = 10000; // Hide title label
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);

        renderProgressBar(guiGraphics, x, y);
    }

    private void renderProgressBar(GuiGraphics guiGraphics, int x, int y) {
        if (menu.isCrafting()) {
            guiGraphics.blit(TEXTURE, x + 99, y + 30, 176, 0, 4, menu.getScaledProgress());
        }
    }

    @Override
    public void render(@NotNull GuiGraphics stack, int mouseX, int mouseY, float partialTicks) {
        super.render(stack, mouseX, mouseY, partialTicks);
        int x = this.getGuiLeft();
        int y = this.getGuiTop();

        if (mouseX > x + 99 && mouseX < x + 104 && mouseY > y + 30 && mouseY < y + 50) {
            List<Component> tooltip = new ArrayList<>();

            if (menu.isCrafting()) {
                int percentage = menu.getProgressPercentage();
                tooltip.add(Component.literal("Progress: " + percentage + "%"));
            } else {
                tooltip.add(Component.literal("Empty Me."));
            }

            stack.renderComponentTooltip(font, tooltip, mouseX, mouseY);
        }
    }
}
