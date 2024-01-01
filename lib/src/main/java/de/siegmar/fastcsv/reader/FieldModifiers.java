package de.siegmar.fastcsv.reader;

import java.util.Locale;

/**
 * Provides some common {@link FieldModifier} implementations.
 */
public final class FieldModifiers {

    /**
     * Modifier that modifies the field value with {@link String#trim()}.
     * Comments are not modified.
     */
    public static final FieldModifier TRIM = (SimpleFieldModifier) String::trim;

    /**
     * Modifier that modifies the field value with {@link String#strip()}.
     * Comments are not modified.
     */
    public static final FieldModifier STRIP = (SimpleFieldModifier) String::strip;

    private FieldModifiers() {
        // Utility class
    }

    /**
     * Builds modifier that modifies the field value with {@link String#toLowerCase(Locale)}.
     * Comments are not modified.
     *
     * @param locale use the case transformation rules for this locale
     * @return a new field modifier that converts the input to lower case.
     */
    public static FieldModifier lower(final Locale locale) {
        return (SimpleFieldModifier) field -> field.toLowerCase(locale);
    }

    /**
     * Builds modifier that modifies the field value with {@link String#toUpperCase(Locale)}.
     * Comments are not modified.
     *
     * @param locale use the case transformation rules for this locale
     * @return a new field modifier that converts the input to upper case.
     */
    public static FieldModifier upper(final Locale locale) {
        return (SimpleFieldModifier) field -> field.toUpperCase(locale);
    }

}
