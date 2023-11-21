package peaksoft.service;

import peaksoft.entity.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingService {
    List<Booking> getAllBooking();
    void saveBooking(Booking booking, Long bookingSaveById);
    Optional<Booking> getBookingById(Long getBookingById);
    void deleteBooking(Long bookingDeleteById);
    void updateBooking(Long id, Booking updateBookingById);
    List<Booking> getAllBooking(Long bookingId);
}
