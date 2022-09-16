import dto.AddressDTO;
import dto.OrderDTO;
import model.Address;
import model.Customer;
import model.Name;
import model.Order;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import static org.junit.Assert.assertEquals;

public class ModelMapperExample {
    public static void main(String[] args) {
        ModelMapper mapper = new ModelMapper();
        //Example 1
        OrderDTO orderDTO = mapper.map(getOrder(), OrderDTO.class);
        assertEquals(getOrder().getCustomer().getName().getFirstName(), orderDTO.getCustomerFirstName());
        assertEquals(getOrder().getCustomer().getName().getLastName(), orderDTO.getCustomerLastName());
        assertEquals(getOrder().getBillingAddress().getStreet(), orderDTO.getBillingStreet());
        assertEquals(getOrder().getBillingAddress().getCity(), orderDTO.getBillingCity());

        //Example 2
        PropertyMap<Order, AddressDTO> addressMap = new PropertyMap<Order, AddressDTO>() {
            @Override
            protected void configure() {
                map().setStreet(source.getBillingAddress().getStreet());
                map().setCity(source.getBillingAddress().getCity());
            }
        };
        mapper.addMappings(addressMap);
        AddressDTO addressDTO = mapper.map(getOrder(), AddressDTO.class);
        assertEquals(getOrder().getBillingAddress().getStreet(), addressDTO.getStreet());
        assertEquals(getOrder().getBillingAddress().getCity(), addressDTO.getCity());
    }

    private static Order getOrder() {
        Name name = new Name();
        name.setFirstName("Santosh");
        name.setLastName("Kotkar");

        Customer customer = new Customer();
        customer.setName(name);

        Address address = new Address();
        address.setStreet("Shilphata Road");
        address.setCity("Thane");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(address);
        return order;
    }
}
