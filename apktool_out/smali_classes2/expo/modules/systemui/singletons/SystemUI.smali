.class public final Lexpo/modules/systemui/singletons/SystemUI;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J;\u0010\u000b\u001a\u00020\u00072\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lexpo/modules/systemui/singletons/SystemUI;",
        "",
        "<init>",
        "()V",
        "",
        "style",
        "Lkotlin/Function0;",
        "Li7/B;",
        "successCallback",
        "Lkotlin/Function1;",
        "failureCallback",
        "setUserInterfaceStyle",
        "(Ljava/lang/String;Lw7/a;Lkotlin/jvm/functions/Function1;)V",
        "(Ljava/lang/String;)V",
        "TAG",
        "Ljava/lang/String;",
        "expo-system-ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lexpo/modules/systemui/singletons/SystemUI;

.field private static final TAG:Ljava/lang/String; = "SystemUI"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/systemui/singletons/SystemUI;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/systemui/singletons/SystemUI;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/systemui/singletons/SystemUI;->INSTANCE:Lexpo/modules/systemui/singletons/SystemUI;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Li7/B;
    .locals 1

    .line 1
    invoke-static {}, Lexpo/modules/systemui/singletons/SystemUI;->setUserInterfaceStyle$lambda$0()Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/systemui/singletons/SystemUI;->setUserInterfaceStyle$lambda$1(Ljava/lang/String;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final setUserInterfaceStyle(Ljava/lang/String;)V
    .locals 3

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-object v0, Lexpo/modules/systemui/singletons/SystemUI;->INSTANCE:Lexpo/modules/systemui/singletons/SystemUI;

    new-instance v1, Lf7/a;

    invoke-direct {v1}, Lf7/a;-><init>()V

    new-instance v2, Lf7/b;

    invoke-direct {v2}, Lf7/b;-><init>()V

    invoke-direct {v0, p0, v1, v2}, Lexpo/modules/systemui/singletons/SystemUI;->setUserInterfaceStyle(Ljava/lang/String;Lw7/a;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final setUserInterfaceStyle(Ljava/lang/String;Lw7/a;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lw7/a;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const/4 v0, -0x1

    if-nez p1, :cond_0

    goto :goto_1

    .line 1
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    if-eqz v1, :cond_5

    const v2, 0x2eef76

    if-eq v1, v2, :cond_3

    const v2, 0x6233516

    if-eq v1, v2, :cond_2

    const v2, 0x63c2322b

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "automatic"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1c

    if-ge p1, p3, :cond_8

    const/4 v0, 0x3

    goto :goto_1

    .line 3
    :cond_2
    const-string v0, "light"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_3
    const-string v0, "dark"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x2

    goto :goto_1

    :cond_5
    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 4
    :cond_6
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid user interface style: \""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\""

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_7
    const/4 v0, 0x1

    .line 5
    :cond_8
    :goto_1
    invoke-static {v0}, Landroidx/appcompat/app/g;->M(I)V

    .line 6
    invoke-interface {p2}, Lw7/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final setUserInterfaceStyle$lambda$0()Li7/B;
    .locals 1

    .line 1
    sget-object v0, Li7/B;->a:Li7/B;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final setUserInterfaceStyle$lambda$1(Ljava/lang/String;)Li7/B;
    .locals 1

    .line 1
    const-string v0, "m"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Li7/B;->a:Li7/B;

    .line 7
    .line 8
    return-object p0
.end method
