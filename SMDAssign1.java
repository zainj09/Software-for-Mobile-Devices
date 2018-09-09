/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package smd.assign1;

/**
 *
 * @author joinz
 */
public class SMDAssign1 {

    public interface HeavyVehicles {

        public void weight();
    }

    public interface PublicTransport {

        public void route();
    }

    abstract static public class vehicle {

        int id;
        String model;
        String color;
        static int vehicle_count;

        abstract void drive();

        public vehicle(int id, String model, String color) {
            this.id = id;
            this.model = model;
            this.color = color;
            vehicle_count++;
        }

        static void showVehicleCount() throws IllegalAccessException {
            System.out.println("vehicles created so far : " + vehicle_count);
            throw new IllegalAccessException("demo");
        }

        public void VehicleDetails() {
            System.out.println("vehicle id : " + id);
            System.out.println("vehicle model : " + model);
            System.out.println("vehicle color : " + color);
        }
    }

    public static class Bus extends vehicle implements PublicTransport, HeavyVehicles {

        public void setId(int id) {
            this.id = id;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public static void setVehicle_count(int vehicle_count) {
            vehicle.vehicle_count = vehicle_count;
        }

        final int seats = 50;

        @Override
        public void route() {
            System.out.println("rout: from DHA to Faisal Town");
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void weight() {
            System.out.println("the weight of vehicle is 5kg");
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public class chassis {

            String vehicle_frame;

            public void setVehicle_frame(String vehicle_frame) {
                this.vehicle_frame = vehicle_frame;
            }

            public chassis() {
            }

            public chassis(String vehicle_frame) {
                this.vehicle_frame = vehicle_frame;
            }

            public void chassis_details() {
                System.out.println("vehicle frame : " + vehicle_frame);
            }
        }

        public static class transportation {

            int total_pessenger_count;

            public void travelledPessengers() {
                System.out.println("total pessengers carried till now : " + total_pessenger_count);
            }
        }

        public Bus(int id, String model, String color) {
            super(id, model, color);

        }

        @Override
        public void drive() {
            System.out.println("bus drive called");
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SMDAssign1.vehicle v = new SMDAssign1.Bus(123, "mod", "white");
        vehicle vh=new Bus(999,"bus model","color1");
        vh.VehicleDetails();
        v.VehicleDetails();
        vehicle bus1 = new Bus(123,"metro","red");
        bus1.VehicleDetails();
        
        try{
            vehicle.showVehicleCount();
            
        }catch(IllegalAccessException e){
            System.out.println("illegal access exception !");
        }
        
        Bus bs= new Bus(345,"latest model","black");
        bs.drive();
        bs.VehicleDetails();
        bs.route();
        bs.weight();
        
        Bus.transportation b=new Bus.transportation();
        b.travelledPessengers();
        

        // TODO code application logic here
    }

}
