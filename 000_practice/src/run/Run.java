package run;

import dto.Car;
import dto.Motorcycle;
import dto.Vehicle;

public class Run {
	public static void main(String[] args) {
		
      // 업 캐스팅: Car 객체를 Vehicle 타입으로 참조
      Vehicle vehicle1 = new Car();
      vehicle1.drive(); // Car 객체의 drive() 메소드 호출 (다형성)
      // Car c1 = ((Car)vehicle1);
      ((Car)vehicle1).accelerate(); // 다운캐스팅
      Vehicle vehicle2 = new Motorcycle();
      vehicle2.drive();
      ((Motorcycle)vehicle2).wheelie();

      // 다운 캐스팅: Vehicle 타입을 Car 타입으로 강제 형변환
//      Car car1 = (Car) vehicle1;
//      car1.accelerate(); // Car 객체의 accelerate() 메소드 호출
//
//      // 업 캐스팅: Motorcycle 객체를 Vehicle 타입으로 참조
//      Vehicle vehicle2 = new Motorcycle();
//      vehicle2.drive(); // Motorcycle 객체의 drive() 메소드 호출 (다형성)
//
//      // 다운 캐스팅: Vehicle 타입을 Motorcycle 타입으로 강제 형변환
//      Motorcycle motorcycle1 = (Motorcycle) vehicle2;
//      motorcycle1.wheelie(); // Motorcycle 객체의 wheelie() 메소드 호출
	}
}
