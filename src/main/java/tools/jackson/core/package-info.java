/**
 * Main public API classes of the core streaming JSON
 * processor: most importantly {@link tools.jackson.core.json.JsonFactory}
 * used for constructing
 * JSON parser ({@link tools.jackson.core.JsonParser})
 * and generator
 * ({@link tools.jackson.core.JsonGenerator})
 * instances.
 * <p>
 * Public API of the higher-level mapping interfaces ("Mapping API")
 * is found from the "jackson-databind" bundle, except for following
 * base interfaces that are defined here:
 * <ul>
 *<li>{@link tools.jackson.core.TreeNode} is included
 *within Streaming API to support integration of the Tree Model
 *(which is based on <code>JsonNode</code>) with the basic
 *parsers and generators (iff using mapping-supporting factory: which
 *is part of Mapping API, not core)
 *  </li>
 *<li>{@link tools.jackson.core.ObjectReadContext} is included so that
 *  reference to the object capable of deserializing
 *  Objects from token streams (usually, <code>tools.jackson.databind.ObjectMapper</code>)
 *  can be exposed, without adding direct dependency to implementation.
 *  </li>
 *<li>{@link tools.jackson.core.ObjectWriteContext} is included so that
 *  reference to the object capable of serializing
 *  Objects from token streams (usually, <code>tools.jackson.databind.ObjectMapper</code>)
 *  can be exposed, without adding direct dependency to implementation.
 *  </li>
 *</ul>
 */

package tools.jackson.core;
