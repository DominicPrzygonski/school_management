package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Address;
import za.ac.cput.factory.AddressFactory;

import za.ac.cput.repository.IAddressRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements IAddressService{

    private static IAddressRepository repository = null;
//    private static IAddressService SERVICE;


    @Autowired private AddressServiceImpl(IAddressRepository addressRepository){
        this.repository = addressRepository;
    }

//    public static IAddressService getService(){
//        if(SERVICE == null){
//            SERVICE = new AddressServiceImpl();
//        }
//        return SERVICE;
//    }

    @Override
    public Address save(Address address) {
        Address obj = AddressFactory.createAddress(address.getStreetNumber(), address.getUnitNumber(), address.getStreetNumber(),
                address.getStreetName(), address.getPostalCode(), address.getCity());
        return this.repository.save(obj);
    }

    @Override
    public Optional<Address> read(Address.AddressID addressID) {
        return this.repository.findById(addressID);
    }

    @Override
    public void delete(Address address) {
        this.repository.delete(address);
    }

    @Override
    public List<Address> getAll() {
        return this.repository.findAll();
    }
}
