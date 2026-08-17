.class public final Lcom/facebook/react/uimanager/drawable/BorderDrawable$invalidatingAndPathChange$1;
.super Lkotlin/properties/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/drawable/BorderDrawable;->invalidatingAndPathChange(Ljava/lang/Object;)Lkotlin/properties/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/properties/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "com/facebook/react/uimanager/drawable/BorderDrawable$invalidatingAndPathChange$1",
        "Lkotlin/properties/b;",
        "LC7/k;",
        "property",
        "oldValue",
        "newValue",
        "Li7/B;",
        "afterChange",
        "(LC7/k;Ljava/lang/Object;Ljava/lang/Object;)V",
        "ReactAndroid_release"
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
.field final synthetic this$0:Lcom/facebook/react/uimanager/drawable/BorderDrawable;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lcom/facebook/react/uimanager/drawable/BorderDrawable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/facebook/react/uimanager/drawable/BorderDrawable;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/facebook/react/uimanager/drawable/BorderDrawable$invalidatingAndPathChange$1;->this$0:Lcom/facebook/react/uimanager/drawable/BorderDrawable;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lkotlin/properties/b;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected afterChange(LC7/k;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LC7/k;",
            "TT;TT;)V"
        }
    .end annotation

    .line 1
    const-string v0, "property"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, p3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/facebook/react/uimanager/drawable/BorderDrawable$invalidatingAndPathChange$1;->this$0:Lcom/facebook/react/uimanager/drawable/BorderDrawable;

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/drawable/BorderDrawable;->access$setNeedUpdatePath$p(Lcom/facebook/react/uimanager/drawable/BorderDrawable;Z)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/facebook/react/uimanager/drawable/BorderDrawable$invalidatingAndPathChange$1;->this$0:Lcom/facebook/react/uimanager/drawable/BorderDrawable;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/drawable/BorderDrawable;->invalidateSelf()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
