import dto.AddressDTO;
import mapper.AddressMapper;
import model.Address;
import model.Customer;
import model.Name;
import model.Order;

import static org.junit.Assert.assertEquals;

public class MapStructExample {
    public static void main(String[] args) {
        AddressDTO addressDTO = AddressMapper.INSTANCE.getAddressDTO(getOrder());
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
