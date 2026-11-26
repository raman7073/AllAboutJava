package com.raman.leetcodedesign;

class ParkingSystem {

    private final int[] slots;

    public ParkingSystem(int big, int medium, int small) {
        this.slots = new int[]{0, big, medium, small};
    }

    public boolean addCar(int carType) {
        if (carType < 1 || carType >= slots.length || slots[carType] == 0) {
            return false;
        }
        slots[carType]--;
        return true;
    }
}