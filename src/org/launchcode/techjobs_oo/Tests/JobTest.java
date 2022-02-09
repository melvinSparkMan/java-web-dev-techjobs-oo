package org.launchcode.techjobs_oo.Tests;


import org.launchcode.techjobs_oo.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JobTest {


    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    public void testIdGenerator() {
        Job createJobObject2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(10, createJobObject2.getId(), 0.001 );
    }

    @Test
    public void testIdReturnsTrue() {
        Job createJobObject = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(createJobObject.isNextIdStatus());
    }

    @Test
    public void testIdGenerator2() {
        Job createJobObject2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(18, createJobObject2.getId(), .001);
    }

    @Test
    public void testAllJobFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job.getName());
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().toString());
        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().toString());
        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality Control", job.getPositionType().toString());
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        Job jobLeft = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        jobLeft.setNextId(1);
        Job jobRight = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertTrue(jobLeft.equals(jobRight));
    }

    @Test
    public void inspectTestId() {
        Job jobRight = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals(22, jobRight.getId(), .001);
        jobRight.setNextId(1);
        assertEquals(2, jobRight.getId(), .001);
    }

    @Test
    public void inspectAField() {
        Job jobLeft = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("ACME", jobLeft.getEmployer().toString());
    }


}