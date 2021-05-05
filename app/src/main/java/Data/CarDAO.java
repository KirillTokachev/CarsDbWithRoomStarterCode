package Data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import Model.Car;

@Dao
public interface CarDAO {

    // Добавление данных
    @Insert
    public long addCar(Car car);

    // Обновление данных
    @Update
    public void updateCar(Car car);

    // Удаление данных
    @Delete
    public void deleteCar(Car car);

    // Извлечение всех строк
    @Query("select * from cars")
    public List<Car> getAllCars();

    // Извлечение одной строки
    @Query("select * from cars where car_id ==:carId")
    public Car getCar(long carId);



}
