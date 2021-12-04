package net.woolgens.api.warp;

import lombok.Data;
import org.bukkit.Location;
import org.bukkit.Material;

@Data
public class Warp {

    private String display;
    private Material material;

    private String locationString;
    private transient Location location;

}
