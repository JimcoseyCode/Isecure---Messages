.class public final synthetic Lcom/facebook/react/animated/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/animated/AnimatedNodeValueListener;


# instance fields
.field public final synthetic a:Lcom/facebook/react/animated/NativeAnimatedModule;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/animated/e;->a:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 5
    .line 6
    iput p2, p0, Lcom/facebook/react/animated/e;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onValueUpdate(DD)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/e;->a:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/animated/e;->b:I

    .line 4
    .line 5
    move-wide v2, p1

    .line 6
    move-wide v4, p3

    .line 7
    invoke-static/range {v0 .. v5}, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->a(Lcom/facebook/react/animated/NativeAnimatedModule;IDD)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
