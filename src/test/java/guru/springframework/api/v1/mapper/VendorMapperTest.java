package guru.springframework.api.v1.mapper;

import guru.springframework.api.v1.model.VendorDTO;
import guru.springframework.domain.Vendor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VendorMapperTest {

    public static final String NAME = "someName";

    VendorMapper vendorMapper = VendorMapper.INSTANCE;

    @Test
    public void vendorToVendorDTO() throws Exception {
        Vendor vendor = new Vendor();
        vendor.setName(NAME);
        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);
        assertEquals(vendor.getName(), vendorDTO.getName());
    }

    @Test
    public void vendorDTOtoVendor() throws Exception {
        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setName(NAME);
        Vendor vendor = vendorMapper.vendorDTOtoVendor(vendorDTO);
        assertEquals(vendorDTO.getName(), vendor.getName());
    }

}