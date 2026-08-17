.class final synthetic Lexpo/modules/image/records/ContentPosition$offsetY$1;
.super Lkotlin/jvm/internal/j;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/image/records/ContentPosition;->offsetY(Landroid/graphics/RectF;Landroid/graphics/RectF;)F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/j;",
        "Lw7/q;"
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


# static fields
.field public static final INSTANCE:Lexpo/modules/image/records/ContentPosition$offsetY$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/image/records/ContentPosition$offsetY$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/image/records/ContentPosition$offsetY$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/image/records/ContentPosition$offsetY$1;->INSTANCE:Lexpo/modules/image/records/ContentPosition$offsetY$1;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "calcYTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F"

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    const/4 v1, 0x5

    .line 5
    const-class v2, Lexpo/modules/image/ImageUtilsKt;

    .line 6
    .line 7
    const-string v3, "calcYTranslation"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)Ljava/lang/Float;
    .locals 1

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p2"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1, p2, p3, p4, p5}, Lexpo/modules/image/ImageUtilsKt;->calcYTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    move-object v2, p2

    check-cast v2, Landroid/graphics/RectF;

    move-object v3, p3

    check-cast v3, Landroid/graphics/RectF;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lexpo/modules/image/records/ContentPosition$offsetY$1;->invoke(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
