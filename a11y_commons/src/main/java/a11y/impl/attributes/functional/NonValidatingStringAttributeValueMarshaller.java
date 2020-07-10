
package a11y.impl.attributes.functional;

import a11y.impl.attributes.AbstractStringAttributeMarshaller;

public class NonValidatingStringAttributeValueMarshaller extends AbstractStringAttributeMarshaller {

    @Override
    protected boolean hasValidForm(String value) {
        return true;
    }

    @Override
    protected String getName() {
        return "GenericStringAttribute";
    }

}