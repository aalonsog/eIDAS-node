package a11y.api.attributes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Definitions {

	/*Prefix and Schema definitions for eIDU specific eIDAS extensions */
	public static final String SCHEMA_ROOT = "/schema/a11y/";
	
	public static final String SAML2_A11Y_CORE_EXTENSIONS_PREFIX = "a11y";
	public static final String SAML2_A11Y_CORE_EXTENSIONS = "http://eidas.europa.eu/attributes/sectorspecific/a11y";
	public static final String SAML2_A11Y_CORE_EXTENSIONS_SCHEMA_LOCATION = SCHEMA_ROOT + "a11y_attributes_generic.xsd";
 
	
	//Format definitions
	public static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd";
	
	
	//attribute types
	public static final String VISION_NAME = "http://eidas.europa.eu/attributes/sectorspecific/a11y/naturalperson/vision";
	public static final String VISION_FRIENDLYNAME = "Vision";

	public static final String COLORPERCEPTION_NAME = "http://eidas.europa.eu/attributes/sectorspecific/a11y/naturalperson/colorperception";
	public static final String COLORPERCEPTION_FRIENDLYNAME = "ColorPerception";

	public static final String HEARING_NAME = "http://eidas.europa.eu/attributes/sectorspecific/a11y/naturalperson/hearing";
	public static final String HEARING_FRIENDLYNAME = "Hearing";

	public static final String VOCALCAPABILITY_NAME = "http://eidas.europa.eu/attributes/sectorspecific/a11y/naturalperson/vocalcapability";
	public static final String VOCALCAPABILITY_FRIENDLYNAME = "VocalCapability";

	public static final String MANIPULATIONSTRENGTH_NAME = "http://eidas.europa.eu/attributes/sectorspecific/a11y/naturalperson/manipulationstrength";
	public static final String MANIPULATIONSTRENGTH_FRIENDLYNAME = "ManipulationStrength";

	public static final String REACH_NAME = "http://eidas.europa.eu/attributes/sectorspecific/a11y/naturalperson/reach";
	public static final String REACH_FRIENDLYNAME = "Reach";

	public static final String COGNITION_NAME = "http://eidas.europa.eu/attributes/sectorspecific/a11y/naturalperson/cognition";
	public static final String COGNITION_FRIENDLYNAME = "Cognition";

	
	
	public static final List<String> A11YATTRIBUTEELIST = Collections.unmodifiableList(new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add(VISION_NAME);
			add(COLORPERCEPTION_NAME);
			add(HEARING_NAME);
			add(VOCALCAPABILITY_NAME);
			add(MANIPULATIONSTRENGTH_NAME);
			add(REACH_NAME);
			add(COGNITION_NAME);

		}
	});

}
