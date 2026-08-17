.class LZ/S$j$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LZ/S$j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ/S$j;->X(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:LZ/S$j;


# direct methods
.method constructor <init>(LZ/S$j;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZ/S$j$a;->b:LZ/S$j;

    .line 2
    .line 3
    iput-object p2, p0, LZ/S$j$a;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lc0/a;Ljava/util/concurrent/Executor;)Lc0/n;
    .locals 2

    .line 1
    new-instance v0, Lc0/n;

    .line 2
    .line 3
    iget-object v1, p0, LZ/S$j$a;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, v1}, Lc0/n;-><init>(Lc0/a;Ljava/util/concurrent/Executor;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
