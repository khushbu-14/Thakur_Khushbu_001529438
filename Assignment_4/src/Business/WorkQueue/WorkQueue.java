/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ArrayList<WorkRequest> getCustomerRequestList(UserAccount account) {
        ArrayList<WorkRequest> customerRequestList = new ArrayList<WorkRequest>();

        for (WorkRequest wr : workRequestList) {
            if (wr.getCustomer() != null) {
                if (wr.getCustomer().getUsername().equals(account.getUsername())) {
                    customerRequestList.add(wr);
                }
            }
        }

        return customerRequestList;
    }

    public ArrayList<WorkRequest> getRestaurantRequestList(UserAccount account) {
        ArrayList<WorkRequest> restaurantRequestList = new ArrayList<WorkRequest>();

        for (WorkRequest wr : workRequestList) {
            if (wr.getRestaurant() != null) {
                if (wr.getRestaurant().getUsername().equals(account.getUsername())) {
                    restaurantRequestList.add(wr);
                }
            }
        }

        return restaurantRequestList;
    }

    public ArrayList<WorkRequest> getDeliveryManRequestList(UserAccount account) {
        ArrayList<WorkRequest> deliveryManRequestList = new ArrayList<WorkRequest>();

        for (WorkRequest wr : workRequestList) {
            if (wr.getDeliverMan() != null) {
                if (wr.getDeliverMan().getUsername().equals(account.getUsername())) {
                    deliveryManRequestList.add(wr);
                }
            }
        }

        return deliveryManRequestList;
    }

    public void addWorkRequest(WorkRequest workRequest) {
        workRequestList.add(workRequest);
    }
}
