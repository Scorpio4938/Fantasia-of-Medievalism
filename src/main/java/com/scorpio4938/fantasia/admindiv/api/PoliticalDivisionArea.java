package com.scorpio4938.fantasia.admindiv.api;

import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class PoliticalDivisionArea {
    public String name;

    public UUID id;

    private String dimension;

    public float DIVISION_LEVEL;

    public BlockPos centerPos;


    /*
     * There is a form of Key-value pairs with Pair modular: https://stackoverflow.com/questions/2973041/a-keyvaluepair-in-java,
     * But here the common form using Hashmap.
     */
    Map<UUID, PoliticalDivisionArea> SUB_DIVISION_PAIRS = new HashMap<>();

    /*
     * Set values.
     */
    public PoliticalDivisionArea(String name, UUID id, String dimension, float level, int x, int y, int z) {
        this.name = name;
        this.id = id;
        this.dimension = dimension;
        this.DIVISION_LEVEL = level;
        this.centerPos = new BlockPos(x, y, z);
    }

    public String getName() {
        return this.name;
    }

    public UUID getId() {
        return this.id;
    }

    public Set<UUID> getSubAdminDivisionId() {
        return this.SUB_DIVISION_PAIRS.keySet();
    }

    public PoliticalDivisionArea[] getSubAdminDivision() {
        return this.SUB_DIVISION_PAIRS.values().toArray(new PoliticalDivisionArea[]{});
    }

    public BlockPos getCenterPos() {
        return this.centerPos;
    }

    public void generateDivMap() {

    }

//    public boolean isInRegion(ServerWorld world, BlockPos pos) {
//        return world.getRegistryKey().getValue().toString().equals(dimension) && pos.getX() >= Math.min(corner1.getX(), corner2.getX()) && pos.getX() <= Math.max(corner1.getX(), corner2.getX()) && pos.getY() >= Math.min(corner1.getY(), corner2.getY()) && pos.getY() <= Math.max(corner1.getY(), corner2.getY()) && pos.getZ() >= Math.min(corner1.getZ(), corner2.getZ()) && pos.getZ() <= Math.max(corner1.getZ(), corner2.getZ());
//    }
}
