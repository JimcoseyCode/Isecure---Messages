.class public final Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilderForRecord;
.super Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/kotlin/records/formatters/PropertySelector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ActionBuilderForRecord"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<InputType::",
        "Lexpo/modules/kotlin/records/Record;",
        ">",
        "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
        "TRecordType;TPropertyType;>.ActionBuilder<TInputType;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0004\u0018\u0000*\u0008\u0008\u0002\u0010\u0002*\u00020\u00012\u0018\u0012\u0004\u0012\u00028\u00020\u0003R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J1\u0010\t\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0003R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ=\u0010\t\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0003R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0004\u0008\t\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilderForRecord;",
        "Lexpo/modules/kotlin/records/Record;",
        "InputType",
        "Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;",
        "Lexpo/modules/kotlin/records/formatters/PropertySelector;",
        "<init>",
        "(Lexpo/modules/kotlin/records/formatters/PropertySelector;)V",
        "Lexpo/modules/kotlin/records/formatters/Formatter;",
        "formatter",
        "format",
        "(Lexpo/modules/kotlin/records/formatters/Formatter;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;",
        "Lkotlin/Function1;",
        "Lexpo/modules/kotlin/records/formatters/Formatter$Builder;",
        "Li7/B;",
        "builder",
        "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;",
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
    iput-object p1, p0, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilderForRecord;->this$0:Lexpo/modules/kotlin/records/formatters/PropertySelector;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;-><init>(Lexpo/modules/kotlin/records/formatters/PropertySelector;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final format$lambda$0(Lexpo/modules/kotlin/records/formatters/Formatter;Lexpo/modules/kotlin/records/Record;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;
    .locals 1

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/records/formatters/Formatter;->format(Lexpo/modules/kotlin/records/Record;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final format$lambda$1(Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/records/Record;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;
    .locals 1

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lexpo/modules/kotlin/records/formatters/FormatterKt;->formatter(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/Formatter;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/records/formatters/Formatter;->format(Lexpo/modules/kotlin/records/Record;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static synthetic i(Lexpo/modules/kotlin/records/formatters/Formatter;Lexpo/modules/kotlin/records/Record;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilderForRecord;->format$lambda$0(Lexpo/modules/kotlin/records/formatters/Formatter;Lexpo/modules/kotlin/records/Record;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/records/Record;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilderForRecord;->format$lambda$1(Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/records/Record;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final format(Lexpo/modules/kotlin/records/formatters/Formatter;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/records/formatters/Formatter<",
            "TInputType;>;)",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;TPropertyType;>.ActionBuilder<TInputType;>;"
        }
    .end annotation

    const-string v0, "formatter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lexpo/modules/kotlin/records/formatters/l;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/records/formatters/l;-><init>(Lexpo/modules/kotlin/records/formatters/Formatter;)V

    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->map(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final format(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
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

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/kotlin/records/formatters/k;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/records/formatters/k;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->map(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    move-result-object p1

    return-object p1
.end method
