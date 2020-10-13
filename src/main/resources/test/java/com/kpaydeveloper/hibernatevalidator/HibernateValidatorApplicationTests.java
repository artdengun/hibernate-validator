package com.kpaydeveloper.hibernatevalidator;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.kpaydeveloper.hibernatevalidator.Buku;
import org.xml.sax.SAXException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

@SpringBootTest
class HibernateValidatorApplicationTests {
	private static Validator validator;

	@Before
	public void setUp() {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		validator = validatorFactory.getValidator();
	}

	@Test
	public void testBuku() {
		Buku buku = new Buku("00001", "Mencari Anak Di Negeri Arah", "Noprianto", "Andi Press", 1969, "1234567890123");
		Set<ConstraintViolation<Buku>> validate = validator.validate(buku);
		Iterator<ConstraintViolation<Buku>> iterator = validate.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getMessage());
		}
		assertEquals(validate.size(),0);
	}
}
