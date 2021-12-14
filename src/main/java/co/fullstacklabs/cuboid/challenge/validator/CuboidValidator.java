package co.fullstacklabs.cuboid.challenge.validator;

import co.fullstacklabs.cuboid.challenge.dto.CuboidDTO;

public class CuboidValidator {

    /**
     * Multiply witdh * deph * heigh and compare result with volume dto
     * @param cuboidDTO
     * @return
     */
    public static boolean isValid(CuboidDTO cuboidDTO) {
        double res = cuboidDTO.getWidth() * cuboidDTO.getDepth() * cuboidDTO.getHeight();
        return cuboidDTO.getVolume() == res;
    }
}
