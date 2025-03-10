package coda.oddorganisms.client.models;

import coda.oddorganisms.OddOrganisms;
import coda.oddorganisms.common.entities.DawnHorse;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DawnHorseModel extends AnimatedGeoModel<DawnHorse> {

    @Override
    public ResourceLocation getModelResource(DawnHorse object) {
        return new ResourceLocation(OddOrganisms.MOD_ID, "geo/dawn_horse.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DawnHorse object) {
        return new ResourceLocation(OddOrganisms.MOD_ID, "textures/entity/dawn_horse.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DawnHorse animatable) {
        return new ResourceLocation(OddOrganisms.MOD_ID, "animations/dawn_horse.animation.json");
    }
}
