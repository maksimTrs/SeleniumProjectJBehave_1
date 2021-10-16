package mainpackage.tests;

import net.serenitybdd.jbehave.SerenityStories;
import net.serenitybdd.jbehave.annotations.Metafilter;
import org.jbehave.core.annotations.UsingEmbedder;

//@Metafilter("+theme test1")
@UsingEmbedder(metaFilters = {"+theme test1", "+theme test2"})
public class AcceptanceTest extends SerenityStories {
// mvn clean verify -Djbehave.meta.filter = "+product cellphone&&phone"
}
//!--And I set birth day 25 and  month 11 and year 1989