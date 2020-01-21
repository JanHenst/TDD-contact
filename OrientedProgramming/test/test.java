import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class test
{

    ContactsManager SUT;
    Contact person;

    @Before
    public void setup() {
        SUT = new ContactsManager();
        person = new Contact();
        person.name = "mensing";
        person.email = "mensing@gmail.com";
        person.phoneNumber = "061234567";
    }

    @Test
    public void addContact_addPerson_nameCheck(){
        SUT.addContact(person);
        String result = SUT.myFriends[0].name;
        assertThat(result, is(person.name));
    }

    @Test
    public void addContact_addPerson_checkPhoneNumber(){
        SUT.addContact(person);
        String result = SUT.myFriends[0].phoneNumber;
        assertThat(result, is(person.phoneNumber));
    }


}
