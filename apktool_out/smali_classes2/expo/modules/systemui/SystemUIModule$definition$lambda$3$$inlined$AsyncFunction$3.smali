.class public final Lexpo/modules/systemui/SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$3;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/systemui/SystemUIModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lexpo/modules/systemui/SystemUIModule;


# direct methods
.method public constructor <init>(Lexpo/modules/systemui/SystemUIModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/systemui/SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$3;->this$0:Lexpo/modules/systemui/SystemUIModule;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lexpo/modules/systemui/SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$3;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Li7/B;"
        }
    .end annotation

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object p1, p1, v0

    .line 2
    check-cast p1, Ljava/lang/Integer;

    .line 3
    const-string v0, "expoRootBackgroundColor"

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 4
    iget-object v2, p0, Lexpo/modules/systemui/SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$3;->this$0:Lexpo/modules/systemui/SystemUIModule;

    invoke-static {v2}, Lexpo/modules/systemui/SystemUIModule;->access$getPrefs(Lexpo/modules/systemui/SystemUIModule;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 5
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 6
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v1, p0, Lexpo/modules/systemui/SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$3;->this$0:Lexpo/modules/systemui/SystemUIModule;

    invoke-static {v1}, Lexpo/modules/systemui/SystemUIModule;->access$getPrefs(Lexpo/modules/systemui/SystemUIModule;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 8
    invoke-interface {v1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 10
    :goto_0
    iget-object v0, p0, Lexpo/modules/systemui/SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$3;->this$0:Lexpo/modules/systemui/SystemUIModule;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lexpo/modules/systemui/SystemUIModule;->access$getSystemBackgroundColor(Lexpo/modules/systemui/SystemUIModule;)I

    move-result p1

    :goto_1
    invoke-static {v0, p1}, Lexpo/modules/systemui/SystemUIModule;->access$setBackgroundColor(Lexpo/modules/systemui/SystemUIModule;I)V

    .line 11
    sget-object p1, Li7/B;->a:Li7/B;

    return-object p1
.end method
