.class public interface abstract Lm9/l;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/l$a;
    }
.end annotation


# static fields
.field public static final a:Lm9/l;

.field public static final b:Lm9/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm9/l$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lm9/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm9/l;->b:Lm9/l$a;

    .line 8
    .line 9
    new-instance v0, Lm9/l$a$a;

    .line 10
    .line 11
    invoke-direct {v0}, Lm9/l$a$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lm9/l;->a:Lm9/l;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public abstract a(ILt9/j;IZ)Z
.end method

.method public abstract b(ILm9/b;)V
.end method

.method public abstract c(ILjava/util/List;)Z
.end method

.method public abstract d(ILjava/util/List;Z)Z
.end method
