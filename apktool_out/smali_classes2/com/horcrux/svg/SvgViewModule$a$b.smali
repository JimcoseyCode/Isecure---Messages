.class Lcom/horcrux/svg/SvgViewModule$a$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/horcrux/svg/SvgViewModule$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:Lcom/horcrux/svg/SvgViewModule$a;


# direct methods
.method constructor <init>(Lcom/horcrux/svg/SvgViewModule$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/SvgViewModule$a$b;->g:Lcom/horcrux/svg/SvgViewModule$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/SvgViewModule$a$b;->g:Lcom/horcrux/svg/SvgViewModule$a;

    .line 2
    .line 3
    iget v1, v0, Lcom/horcrux/svg/SvgViewModule$a;->g:I

    .line 4
    .line 5
    iget-object v2, v0, Lcom/horcrux/svg/SvgViewModule$a;->h:Lcom/facebook/react/bridge/ReadableMap;

    .line 6
    .line 7
    iget-object v3, v0, Lcom/horcrux/svg/SvgViewModule$a;->i:Lcom/facebook/react/bridge/Callback;

    .line 8
    .line 9
    iget v0, v0, Lcom/horcrux/svg/SvgViewModule$a;->j:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0}, Lcom/horcrux/svg/SvgViewModule;->a(ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
