.class public abstract LR7/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lb8/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR7/h$a;
    }
.end annotation


# static fields
.field public static final b:LR7/h$a;


# instance fields
.field private final a:Lk8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LR7/h$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LR7/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LR7/h;->b:LR7/h$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Lk8/f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LR7/h;->a:Lk8/f;

    return-void
.end method

.method public synthetic constructor <init>(Lk8/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LR7/h;-><init>(Lk8/f;)V

    return-void
.end method


# virtual methods
.method public getName()Lk8/f;
    .locals 1

    .line 1
    iget-object v0, p0, LR7/h;->a:Lk8/f;

    .line 2
    .line 3
    return-object v0
.end method
