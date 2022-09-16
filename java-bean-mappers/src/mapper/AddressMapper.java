package mapper;

import dto.AddressDTO;
import model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    @Mappings({
            @Mapping(source = "billingAddress.street", target = "street"),
            @Mapping(source = "billingAddress.city", target = "city")
    })
    AddressDTO getAddressDTO(Order order);
}
