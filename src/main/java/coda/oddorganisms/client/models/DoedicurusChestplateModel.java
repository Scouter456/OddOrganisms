package coda.oddorganisms.client.models;

import coda.oddorganisms.OddOrganisms;
import coda.oddorganisms.common.items.DoedicurusChestplateItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DoedicurusChestplateModel extends AnimatedGeoModel<DoedicurusChestplateItem> {

    @Override
    public ResourceLocation getModelLocation(DoedicurusChestplateItem object) {
        return new ResourceLocation(OddOrganisms.MOD_ID, "geo/doedicurus_chestplate.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(DoedicurusChestplateItem object) {
        return new ResourceLocation(OddOrganisms.MOD_ID, "textures/armor/doedicurus_chestplate.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(DoedicurusChestplateItem object) {
        return null;
    }
}
