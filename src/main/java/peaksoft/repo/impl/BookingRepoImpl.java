package peaksoft.repo.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.entity.Booking;
import peaksoft.repo.BookingRepo;

import java.util.List;
import java.util.Optional;
@Repository
@Transactional

public class BookingRepoImpl implements BookingRepo {

    @PersistenceContext
    private  EntityManager entityManager;
    @Override
    public List<Booking> getAllBooking() {
        return entityManager.createQuery("select c from Booking c", Booking.class).getResultList();
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
