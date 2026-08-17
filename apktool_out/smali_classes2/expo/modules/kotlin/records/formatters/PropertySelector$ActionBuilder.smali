.class public Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/kotlin/records/formatters/PropertySelector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ActionBuilder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<InputType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0096\u0004\u0018\u0000*\u0004\u0008\u0002\u0010\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004Jm\u0010\n\u001a\u0018\u0012\u0004\u0012\u00028\u00030\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\u0008\u0003\u0010\u0005\"\u0004\u0008\u0004\u0010\u00062\u001e\u0008\u0002\u0010\u0008\u001a\u0018\u0012\u0004\u0012\u00028\u00030\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ?\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u000c0\tH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ=\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\u0008\u0003\u0010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014JC\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\u0008\u0003\u0010\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\t\u00a2\u0006\u0004\u0008\u0013\u0010\u000fJ9\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u000c0\u0011\u00a2\u0006\u0004\u0008\u0016\u0010\u0014J1\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0017\u00a2\u0006\u0004\u0008\u0016\u0010\u0018J=\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u000c0\t\u00a2\u0006\u0004\u0008\u0016\u0010\u000f\u00a8\u0006\u0019"
    }
    d2 = {
        "Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;",
        "InputType",
        "",
        "<init>",
        "(Lexpo/modules/kotlin/records/formatters/PropertySelector;)V",
        "T",
        "R",
        "Lexpo/modules/kotlin/records/formatters/PropertySelector;",
        "nextBuilder",
        "Lkotlin/Function2;",
        "nextAction",
        "(Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;",
        "",
        "shouldSkip",
        "defaultSkipAction",
        "(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;",
        "ResultType",
        "Lkotlin/Function1;",
        "mapper",
        "map",
        "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;",
        "valueSelector",
        "skip",
        "Lexpo/modules/kotlin/records/formatters/ValueSelector;",
        "(Lexpo/modules/kotlin/records/formatters/ValueSelector;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lexpo/modules/kotlin/records/formatters/PropertySelector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;TPropertyType;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/records/formatters/PropertySelector;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->this$0:Lexpo/modules/kotlin/records/formatters/PropertySelector;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip$lambda$4(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->nextAction$lambda$0(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function2;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->map$lambda$3(Lkotlin/jvm/functions/Function2;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Lexpo/modules/kotlin/records/formatters/ValueSelector;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip$lambda$6(Lexpo/modules/kotlin/records/formatters/ValueSelector;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final defaultSkipAction(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;TPropertyType;>.ActionBuilder<TInputType;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lexpo/modules/kotlin/records/formatters/d;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lexpo/modules/kotlin/records/formatters/d;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 7
    .line 8
    iget-object v1, p0, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->this$0:Lexpo/modules/kotlin/records/formatters/PropertySelector;

    .line 9
    .line 10
    invoke-direct {p1, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;-><init>(Lexpo/modules/kotlin/records/formatters/PropertySelector;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, v0}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->nextAction(Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method private static final defaultSkipAction$lambda$1(Lkotlin/jvm/functions/Function2;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Lexpo/modules/kotlin/records/formatters/ValueOrSkip;
    .locals 1

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    sget-object p0, Lexpo/modules/kotlin/records/formatters/ValueOrSkip$Skip;->INSTANCE:Lexpo/modules/kotlin/records/formatters/ValueOrSkip$Skip;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance p0, Lexpo/modules/kotlin/records/formatters/ValueOrSkip$Value;

    .line 22
    .line 23
    invoke-direct {p0, p2}, Lexpo/modules/kotlin/records/formatters/ValueOrSkip$Value;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function2;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Lexpo/modules/kotlin/records/formatters/ValueOrSkip;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->defaultSkipAction$lambda$1(Lkotlin/jvm/functions/Function2;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Lexpo/modules/kotlin/records/formatters/ValueOrSkip;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->map$lambda$2(Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function2;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip$lambda$7(Lkotlin/jvm/functions/Function2;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip$lambda$5(Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final map$lambda$2(Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final map$lambda$3(Lkotlin/jvm/functions/Function2;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final nextAction(Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;TPropertyType;>.ActionBuilder<TT;>;",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;TPropertyType;>.ActionBuilder<TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "null cannot be cast to non-null type kotlin.Function2<RecordType of expo.modules.kotlin.records.formatters.PropertySelector, kotlin.Any?, kotlin.Any?>"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-static {p2, v0}, Lkotlin/jvm/internal/I;->e(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 12
    .line 13
    iget-object v0, p0, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->this$0:Lexpo/modules/kotlin/records/formatters/PropertySelector;

    .line 14
    .line 15
    invoke-virtual {v0}, Lexpo/modules/kotlin/records/formatters/PropertySelector;->getAction$expo_modules_core_release()Lkotlin/jvm/functions/Function2;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->this$0:Lexpo/modules/kotlin/records/formatters/PropertySelector;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lexpo/modules/kotlin/records/formatters/j;

    .line 25
    .line 26
    invoke-direct {v2, v0, p2}, Lexpo/modules/kotlin/records/formatters/j;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 27
    .line 28
    .line 29
    move-object p2, v2

    .line 30
    :goto_0
    invoke-virtual {v1, p2}, Lexpo/modules/kotlin/records/formatters/PropertySelector;->setAction$expo_modules_core_release(Lkotlin/jvm/functions/Function2;)V

    .line 31
    .line 32
    .line 33
    return-object p1
.end method

.method static synthetic nextAction$default(Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x1

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    new-instance p1, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 8
    .line 9
    iget-object p3, p0, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->this$0:Lexpo/modules/kotlin/records/formatters/PropertySelector;

    .line 10
    .line 11
    invoke-direct {p1, p3}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;-><init>(Lexpo/modules/kotlin/records/formatters/PropertySelector;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-direct {p0, p1, p2}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->nextAction(Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 20
    .line 21
    const-string p1, "Super calls with default arguments not supported in this target, function: nextAction"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method private static final nextAction$lambda$0(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p2, p3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of p3, p0, Lexpo/modules/kotlin/records/formatters/ValueOrSkip;

    .line 11
    .line 12
    if-eqz p3, :cond_2

    .line 13
    .line 14
    move-object p3, p0

    .line 15
    check-cast p3, Lexpo/modules/kotlin/records/formatters/ValueOrSkip;

    .line 16
    .line 17
    instance-of v0, p3, Lexpo/modules/kotlin/records/formatters/ValueOrSkip$Value;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    check-cast p0, Lexpo/modules/kotlin/records/formatters/ValueOrSkip$Value;

    .line 22
    .line 23
    invoke-virtual {p0}, Lexpo/modules/kotlin/records/formatters/ValueOrSkip$Value;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p1, p2, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    sget-object p0, Lexpo/modules/kotlin/records/formatters/ValueOrSkip$Skip;->INSTANCE:Lexpo/modules/kotlin/records/formatters/ValueOrSkip$Skip;

    .line 33
    .line 34
    invoke-static {p3, p0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    new-instance p0, Li7/m;

    .line 42
    .line 43
    invoke-direct {p0}, Li7/m;-><init>()V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_2
    invoke-interface {p1, p2, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method public static synthetic skip$default(Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    new-instance p1, Lexpo/modules/kotlin/records/formatters/e;

    .line 8
    .line 9
    invoke-direct {p1}, Lexpo/modules/kotlin/records/formatters/e;-><init>()V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 18
    .line 19
    const-string p1, "Super calls with default arguments not supported in this target, function: skip"

    .line 20
    .line 21
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p0
.end method

.method private static final skip$lambda$4(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method private static final skip$lambda$5(Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method private static final skip$lambda$6(Lexpo/modules/kotlin/records/formatters/ValueSelector;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p2}, Lexpo/modules/kotlin/records/formatters/ValueSelector;->invoke(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private static final skip$lambda$7(Lkotlin/jvm/functions/Function2;Lexpo/modules/kotlin/records/Record;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method


# virtual methods
.method public final map(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultType:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;TPropertyType;>.ActionBuilder<TInputType;>;"
        }
    .end annotation

    const-string v0, "mapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lexpo/modules/kotlin/records/formatters/g;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/records/formatters/g;-><init>(Lkotlin/jvm/functions/Function1;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, p1, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->nextAction$default(Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final map(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultType:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;TPropertyType;>.ActionBuilder<TInputType;>;"
        }
    .end annotation

    const-string v0, "mapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/kotlin/records/formatters/h;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/records/formatters/h;-><init>(Lkotlin/jvm/functions/Function2;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, p1, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->nextAction$default(Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final skip(Lexpo/modules/kotlin/records/formatters/ValueSelector;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/records/formatters/ValueSelector<",
            "TInputType;>;)",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;TPropertyType;>.ActionBuilder<TInputType;>;"
        }
    .end annotation

    const-string v0, "valueSelector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/kotlin/records/formatters/f;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/records/formatters/f;-><init>(Lexpo/modules/kotlin/records/formatters/ValueSelector;)V

    invoke-direct {p0, v0}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->defaultSkipAction(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;TPropertyType;>.ActionBuilder<TInputType;>;"
        }
    .end annotation

    const-string v0, "valueSelector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lexpo/modules/kotlin/records/formatters/i;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/records/formatters/i;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0, v0}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->defaultSkipAction(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final skip(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;TPropertyType;>.ActionBuilder<TInputType;>;"
        }
    .end annotation

    const-string v0, "valueSelector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lexpo/modules/kotlin/records/formatters/c;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/records/formatters/c;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-direct {p0, v0}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->defaultSkipAction(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    move-result-object p1

    return-object p1
.end method
