/*
 * ExerciseThing
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Oct 4, 2011
 * 
 */
package gof.decorator;

/**
 * @author albee
 *
 * @version $Id$
 */
public class ExerciseThing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintableThing pt = new Thing("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse quis accumsan mauris. Mauris interdum dui leo, at dictum metus. Nullam dignissim justo id ipsum tristique euismod. In vitae lacus felis. Nullam volutpat feugiat metus molestie bibendum. Maecenas sed orci ac lorem accumsan fringilla. Morbi fringilla interdum velit et convallis. Vivamus aliquam adipiscing nulla, a consequat neque pulvinar dapibus. Curabitur mattis gravida quam, viverra viverra augue semper et. Aenean imperdiet imperdiet posuere.\nNulla non magna eu lacus ornare facilisis. Proin sed est sit amet libero viverra consectetur. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Proin aliquam egestas metus, eu aliquet est ullamcorper vitae. Ut nec metus eget eros molestie pretium. Nam eu massa purus. Mauris semper vestibulum justo tempor tempus. Nulla suscipit urna lacinia purus tincidunt sit amet ornare metus tempor. Nam at consequat eros. Nunc interdum sollicitudin felis, at posuere est venenatis quis. Aliquam libero lacus, aliquam nec tristique eu, feugiat nec nulla. Nullam venenatis posuere neque, eleifend vestibulum nisi egestas id. Aenean ultricies, dui a mattis consectetur, ipsum nisi porttitor risus, non mattis eros diam id nulla. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\nDonec sed est in elit adipiscing venenatis sed quis tellus. Donec accumsan felis eget nibh blandit suscipit. Cras est mauris, dictum vitae pulvinar sed, hendrerit vitae dolor. Suspendisse vitae elit massa. Nulla eu urna eu orci laoreet commodo. Vivamus sit amet vehicula libero. Suspendisse placerat, erat vitae facilisis hendrerit, nibh dolor pharetra dui, et sodales quam diam in mauris. Aenean eu est urna, in elementum ipsum. Donec pulvinar mollis dictum. Praesent massa nulla, eleifend sit amet feugiat at, rutrum vitae nunc. Nulla elit ante, accumsan sit amet rhoncus quis, ultrices eget quam. Pellentesque semper, neque at tincidunt dapibus, diam ante porta nisi, eget ornare erat sem at diam. Etiam porttitor consectetur nisi, sed porttitor ligula adipiscing vitae.\nAenean adipiscing, ligula id dictum tempus, nibh nulla imperdiet metus, a rutrum dui libero ut nibh. Sed quis volutpat leo. Aliquam erat volutpat. In dictum, velit ac semper gravida, nisl velit ultricies lectus, vel pellentesque odio mauris vel dolor. Nunc sollicitudin nisl eget mauris laoreet ac tincidunt tortor adipiscing. Proin ante urna, facilisis ut vehicula eu, ultrices ultricies dolor. Nulla nisi neque, varius sit amet consequat quis, vestibulum vitae nibh. Suspendisse dolor tortor, hendrerit id faucibus eget, bibendum quis nunc.\nAenean aliquam erat eu mi sodales vitae molestie risus ullamcorper. Nullam in urna libero. Pellentesque elit nisl, ultricies rutrum volutpat interdum, pellentesque vel orci. Pellentesque sit amet sem et magna vulputate luctus. Nulla pellentesque feugiat erat, nec aliquet enim vehicula at. Vestibulum sagittis, mauris ut sollicitudin cursus, elit orci congue sapien, ac sollicitudin sem massa quis ipsum. Sed egestas hendrerit ligula ut interdum. Cras facilisis purus et dui euismod vel ultrices sem pellentesque. Etiam mollis, erat nec egestas viverra, nunc sem vulputate sem, at laoreet neque dui in metus. Nunc dictum dui quis sem gravida sit amet ultricies felis mattis. Sed molestie, nisi sed mattis mollis, massa metus porta erat, ut pharetra libero mi vel urna. Vivamus commodo nibh non nisl mattis mattis ac ut mauris. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.");
		System.out.println(pt.print());
		pt = new Disemvowel(new StripPunctuation(new Shout(pt)));
		System.out.println(pt.print());
		
	}

}
