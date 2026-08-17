.class LE0/i$c$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/i$c;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:LH0/a;

.field final synthetic h:Ljava/lang/Object;

.field final synthetic i:LE0/i$c;


# direct methods
.method constructor <init>(LE0/i$c;LH0/a;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE0/i$c$a;->i:LE0/i$c;

    .line 2
    .line 3
    iput-object p2, p0, LE0/i$c$a;->g:LH0/a;

    .line 4
    .line 5
    iput-object p3, p0, LE0/i$c$a;->h:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, LE0/i$c$a;->g:LH0/a;

    .line 2
    .line 3
    iget-object v1, p0, LE0/i$c$a;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, v1}, LH0/a;->accept(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
