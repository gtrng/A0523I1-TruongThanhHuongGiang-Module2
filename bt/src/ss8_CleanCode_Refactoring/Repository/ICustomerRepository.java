package ss8_CleanCode_Refactoring.Service;

import ss8_CleanCode_Refactoring.Model.Customer;

public interface ICustomerRepository {
    Customer[] getListCustomer();
    void addCustomer(Customer customer);
    void deleteCustomerById(int id);
}
