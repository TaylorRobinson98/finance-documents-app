
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testUserCreation() {
        User user = new User(1, "Alice", "alice@example.com", "Digital");
        assertEquals(1, user.getUserId());
        assertEquals("Alice", user.getName());
        assertEquals("alice@example.com", user.getEmail());
        assertEquals("Digital", user.getDeliveryPreference());
    }

    @Test
    public void testUpdateDeliveryPreference() {
        User user = new User(2, "Bob", "bob@example.com", "Mail");
        user.setDeliveryPreference("Digital");
        assertEquals("Digital", user.getDeliveryPreference());
    }

    @Test
    public void testMockNotificationService() {
        NotificationService notificationService = mock(NotificationService.class);
        User user = new User(3, "Charlie", "charlie@example.com", "Digital");

        when(notificationService.sendWelcomeMessage(user.getEmail())).thenReturn(true);

        boolean result = notificationService.sendWelcomeMessage(user.getEmail());
        assertTrue(result);

        verify(notificationService).sendWelcomeMessage(user.getEmail());
    }

    interface NotificationService {
        boolean sendWelcomeMessage(String email);
    }
}
