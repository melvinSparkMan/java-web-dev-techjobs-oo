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
        assertEquals(6, createJobObject2.getId(), 0.001 );
    }


    @Test
    public void testIdGenerator2() {
        Job createJobObject2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(10, createJobObject2.getId(), .001);
    }

    @Test
    public void testAllJobFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job.getName());
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());
        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());
        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality Control", job.getPositionType().getValue());
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job jobLeft = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job jobRight = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertFalse(jobLeft.equals(jobRight));
    }

    @Test
    public void inspectTestId() {
        Job countJobId11 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals(11, countJobId11.getId(), .001);
        Job countJobId12 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals(12, countJobId12.getId(), .001);
        Job countJobId13 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals(13, countJobId13.getId(), .001);
    }

    @Test
    public void inspectAField() {
        Job jobLeft = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("ACME", jobLeft.getEmployer().getValue());
    }


    @Test
    public void testForBeginningLineFeed() {
        Job testjob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(true,testjob.toString().startsWith("\n"));
    }

    @Test
    public void testForEndingLineFeed() {
        Job testjob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(true,testjob.toString().endsWith("\n"));
    }

    @Test
    public void testForEmptyField() {
        Job testjob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(false,testjob.toString().contains("Data not available"));
    }

    @Test
    public void testForEmptyNameField() {
        Job testjob = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(true,testjob.toString().contains("Data not available"));
    }

    @Test
    public void testForEmptyEmployerField() {
        Job testjob = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(true,testjob.toString().contains("Data not available"));
    }

    @Test
    public void testForEmptyLocationField() {
        Job testjob = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(true,testjob.toString().contains("Data not available"));
    }

    @Test
    public void testForEmptyPositionTypeField() {
        Job testjob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        assertEquals(true,testjob.toString().contains("Data not available"));
    }

    @Test
    public void testForEmptyCoreCompetencyField() {
        Job testjob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        assertEquals(true,testjob.toString().contains("Data not available"));
    }

}