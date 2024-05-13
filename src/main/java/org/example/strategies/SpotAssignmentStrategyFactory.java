package org.example.strategies;

import org.example.models.SpotCalculationStrategyType;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotforType(SpotCalculationStrategyType spotCalculationStrategyType){
        switch (spotCalculationStrategyType){
            case RANDOM_SPOT:
                return new RandomSpotAssignmentStrategy();
            case NEAREST_SPOT:
                return new NearbySpotAssignmentStrategy();
            default:
                return new RandomSpotAssignmentStrategy();
        }
    }
}
