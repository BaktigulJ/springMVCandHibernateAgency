package peaksoft.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.entity.Booking;
import peaksoft.repo.BookingRepo;
import peaksoft.service.BookingService;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepo bookingRepo;
    @Override
    public List<Booking> getAllBooking() {
        return bookingRepo.getAllBooking();
    }

    @Override
    public void saveBooking(Booking booking, Long bookingSaveById) {

    }

    @Override
    public Optional<Booking> getBookingById(Long getBookingById) {
        return Optional.empty();
    }

    @Override
    public void deleteBooking(Long bookingDeleteById) {

    }

    @Override
    public void updateBooking(Long id, Booking updateBookingById) {

    }

    @Override
    public List<Booking> getAllBooking(Long bookingId) {
        return null;
    }
}
