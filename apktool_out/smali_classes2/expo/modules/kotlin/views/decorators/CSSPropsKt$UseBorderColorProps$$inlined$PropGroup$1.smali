.class public final Lexpo/modules/kotlin/views/decorators/CSSPropsKt$UseBorderColorProps$$inlined$PropGroup$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/kotlin/views/decorators/CSSPropsKt;->UseBorderColorProps(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;Lw7/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0xb0
.end annotation


# instance fields
.field final synthetic $body:Lw7/o;

.field final synthetic $value:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lw7/o;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/views/decorators/CSSPropsKt$UseBorderColorProps$$inlined$PropGroup$1;->$body:Lw7/o;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/kotlin/views/decorators/CSSPropsKt$UseBorderColorProps$$inlined$PropGroup$1;->$value:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/kotlin/views/decorators/CSSPropsKt$UseBorderColorProps$$inlined$PropGroup$1;->invoke(Landroid/view/View;Ljava/lang/Object;)V

    sget-object p1, Li7/B;->a:Li7/B;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lexpo/modules/kotlin/views/decorators/CSSPropsKt$UseBorderColorProps$$inlined$PropGroup$1;->$body:Lw7/o;

    iget-object v1, p0, Lexpo/modules/kotlin/views/decorators/CSSPropsKt$UseBorderColorProps$$inlined$PropGroup$1;->$value:Ljava/lang/Object;

    invoke-interface {v0, p1, v1, p2}, Lw7/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
