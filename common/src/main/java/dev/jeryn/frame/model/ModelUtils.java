package dev.jeryn.frame.model;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;

public class ModelUtils {

    public static ModelPart findPart(HierarchicalModel<?> model, String partName) {
        return model.root()
                .getAllParts()
                .filter(part -> part.hasChild(partName))
                .findFirst()
                .map(part -> part.getChild(partName))
                .orElseThrow(() -> new IllegalArgumentException("Part not found: " + partName));
    }

}
